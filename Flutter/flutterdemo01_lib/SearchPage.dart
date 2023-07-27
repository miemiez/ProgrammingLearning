import 'package:flutter/material.dart';

class SearchPage extends StatelessWidget {
  final String? str;
  const SearchPage({super.key,required this.str});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
            appBar: AppBar(
              title: const Text('Search'),
            ),
            body: ListView(
              padding: const EdgeInsets.all(10),
              children: [
                 Row(
                  children: [Text('热搜', style: TextStyle(fontSize: 20))],
                ),
                const Divider(),
                Wrap(
                  spacing: 10,
                  runSpacing: 10,
                  children: [
                    Button("女装", onPressed: () {}),
                    Button("笔记本", onPressed: () {}),
                    Button("玩具", onPressed: () {}),
                    Button("文学", onPressed: () {}),
                    Button("女装", onPressed: () {}),
                    Button("时尚", onPressed: () {}),
                    Button("女装", onPressed: () {}),
                    Button("女装", onPressed: () {}),
                  ],
                ),
                const SizedBox(
                  height: 10,
                ),
                const Row(
                  children: [
                    Text('历史记录', style: TextStyle(fontSize: 20)),
                  ],
                ),
                const Divider(),
                const Column(
                  //crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    ListTile(
                      title: Text('女装'),
                      contentPadding: EdgeInsets.all(8),
                    ),
                    Divider(),
                    ListTile(
                      title: Text('手机'),
                      contentPadding: EdgeInsets.all(8),
                    ),
                    Divider(),
                    ListTile(
                      title: Text('电脑'),
                      contentPadding: EdgeInsets.all(8),
                    ),
                    Divider(),
                  ],
                ),
                const SizedBox(
                  height: 10,
                ),
                Padding(
                  padding: const EdgeInsets.all(40),
                  child: OutlinedButton.icon(
                      onPressed: () {},
                      icon: const Icon(Icons.delete),
                      label: const Text("清空历史记录")),
                ), //自适应
              ],
            ));
  }
}

class Button extends StatelessWidget {
  String text;
  void Function()? onPressed;
  Button(this.text, {Key? key, required this.onPressed}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ElevatedButton(
      onPressed: onPressed,
      style: ButtonStyle(
        backgroundColor:
            MaterialStateProperty.all(const Color.fromARGB(255, 236, 233, 233)),
        foregroundColor: MaterialStateProperty.all(Colors.black45),
      ),
      child: Text(text),
    );
  }
}
