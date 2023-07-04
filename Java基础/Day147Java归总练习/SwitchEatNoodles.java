package Day147Java归总练习;

public class SwitchEatNoodles {
    /*
    兰州牛肉面，武汉热干面，北京炸酱面，四川担担面
     */

    //1.我心里想吃的面
    String noodles = "贵阳肠旺面";

    //2.和switch进行匹配
    public static void main(String[] args) {
        String noodles = "贵阳肠旺面";
        switch ("贵阳肠旺面") {
            case "兰州牛肉面" :
                System.out.println("吃兰州牛肉面，好吃！！");
                break;
            case "武汉热干面" :
                System.out.println("吃武汉热干面，好吃！！");
                    break;
            case "北京炸酱面" :
                System.out.println("吃北京炸酱面，好吃！！");
                break;
            case "四川担担面" :
                System.out.println("吃四川担担面，好吃！！");
                break;
            default:
                System.out.println("没有！吃泡面吧你！");
                break;
        }
    }
}
