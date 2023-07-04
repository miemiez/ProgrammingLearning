package Day0608;

import Day0518.homework09_.Point;

import java.util.ArrayList;

//马踏棋盘
public class HouseChessBoard {

    //定义属性
    private static int X = 6;//col
    private static int Y = 6;//row
    private static int[][] chessBoard = new int[Y][X];//棋盘
    private static boolean[] visited = new boolean[X * Y];//记录走过的路
    private static boolean finished = false;//记录马儿是否遍历完棋盘

    public static void main(String[] args) {

        int row = 5;
        int col = 5;

        //测试
        long start = System.currentTimeMillis();
        traversalChessBoard(chessBoard,row - 1,col - 1,1);
        long end = System.currentTimeMillis();

        System.out.println("遍历耗时: " + (end - start));

        //输出当前棋盘情况
        for (int[] rows : chessBoard) {
            for (int step : rows) {//该位置是马应该走的第几步
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }

    //编写核心算法，如果遍历成功，就把 finished 设置为true，
    //并且将马走的每一步 step，记录到 chessBoard
    public static void traversalChessBoard(int[][] chessBoard,int row,int col,int step) {

        //先把step 记录到 chessBoard
        chessBoard[row][col] = step;
        //把这个位置，设置为已经访问
        visited[row * X + col] = true;
        //获取当前位置可以走的下一个位置有哪些
        ArrayList<Point> ps = next(new Point(col,row));
        //遍历
        while (!ps.isEmpty()) {
            //取出当前ps 第一个位置点
            Point p = ps.remove(0);
            //判断该位置是否走过，如果没有走过，就递归遍历
            if (!visited[(int) (p.y * X + p.x)]) {
                traversalChessBoard(chessBoard, (int) p.y, (int) p.x,step + 1);
            }
        }

        //当退出while，看看是否遍历成功，如果没有成功，就重制相应的值，然后进行回溯
        if (step < X * Y && !finished) {
            //重制
            chessBoard[row][col] = 0;
            visited[row * X + col] = false;
        } else {
            finished = true;
        }
    }

    //编写方法，获取马可以走的下一步的所有位置 point(x,y)
    public static ArrayList<Point> next(Point curPoint) {

        //创建一个ArrayList
        ArrayList<Point> ps = new ArrayList<>();
        Point p1 = new Point();

        //判断在cur 是否可以如下走，如果可以就放入ps
        //判断是否可以走5位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走6位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走7位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走0位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走1位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走2位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走3位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走4位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        return ps;
    }



}
