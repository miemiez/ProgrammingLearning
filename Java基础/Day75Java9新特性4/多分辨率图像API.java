package Day75Java9新特性4;

public class 多分辨率图像API {
	/*
	 * 在Mac上，JDK已经支持视网膜显示，但在Linux和Windows上它并没有，在那里，Java程序在当前的高分辨率屏幕上可能看起来很小
	 * JEP263扩展了JDK，即Windows和Linux也考虑到了像素的大小，使用比现在更多的现代API：
	 *     Direct2D for Windows和GTK+，而不是Xlib for Linux，图形，窗口和文本由此自动缩放
	 * JEP251还提供了处理多分辨率图像的能力，即包含不同分辨率的相同图像的文件，根据相应屏幕的DPI度量，然后以适当的分辨率使用图像
	 * 
	 * 1.新的API定义在java.awt.image包下
	 * 2.将不同分辨率的图像封装到一张（多分辨率的）图像中，作为它的变体
	 * 3.获取这个图像的所有变体
	 * 4.获取特定分辨率的图像变体-表示一张已知分辨率单位为DPI的特定尺寸大小的逻辑图像，并且这张图像是最佳的变体
	 * 4.基于当前屏幕分辨率大小和运用的图像转换算法，
	 *     java.awt.Graphics类可以从接口MultiResolutionImage获取所需的变体
	 * 5.MultiResolutionImage的基础实现是
	 *     java.awt.image.BaseMultiResolutionImage
	 */
}
