package Day73Java9新特性02;

public class 多版本兼容jar包的使用说明 {
	/*
	 * 当一个新版本的java出现的时候，你的库用户要花费数年时间才会切换到这个新的版本，
	 * 这就意味着库得去向后兼容你想要支持的最老的java版本（许多情况下就是java6或者java7），
	 * 这也就意味着未来的很长一段时间，都不能在库中运用java9所提供的新特性，
	 * 这个时候多版本兼容jar功能能让你创建仅在特定版本的java环境中运行库程序选择使用的class版本
	 * 
	 * 针对不同的版本，同样的一个jar包里面的同样的测试代码（不同的API），结果运行也就不一样【不同版本运行相应版本的API】
	 * javac -d build --release 8 src/main/java/com/lhy/*.java
	 * javac -d build9 --release 9 src/main/java-9/com/lhy/*.java
	 * 【生成jar包】jar --create --main-class=Application --file mutijar.jar -C build.--release 9 -C build9.
	 * 
	 */
}
