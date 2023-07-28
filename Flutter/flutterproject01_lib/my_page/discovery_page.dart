import 'package:flutter/material.dart';

class DiscoveryPage extends StatefulWidget {
  @override
  _DiscoveryPageState createState() => _DiscoveryPageState();
}

class _DiscoveryPageState extends State<DiscoveryPage> {
  List<Map<String,IconData>> blocks = [
    {'开源众包':Icons.pageview,
      '开源软件':Icons.speaker_notes_off,
      '码云推荐':Icons.screen_share,
      '代码骗贷':Icons.assignment,
    },
    {'扫一扫':Icons.camera_alt,
    '摇一摇':Icons.camera},
    {'码云封面人物':Icons.person,
    '线下活动':Icons.android}
  ];

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemCount: blocks.length,
      itemBuilder: (context,blockIndex){
            return Container(
                margin: const EdgeInsets.symmetric(vertical: 10),
                decoration: const BoxDecoration(
                    border: Border(
                        top:BorderSide(
                            width: 2.0,
                            color: Color(0xffcecccc)
                        ),
                        bottom:BorderSide(
                            width: 2.0,
                            color: Color(0xffcecccc)
                        )
                    )
                ),
                child: ListView.separated(
                  physics: const NeverScrollableScrollPhysics(),
                  shrinkWrap: true,
                  itemCount: blocks[blockIndex].length,
                  itemBuilder: (context,mapIndex){
                    return InkWell(
                        onTap: (){

                        },
                        child: ListTile(
                              leading: Icon(blocks[blockIndex].values.elementAt(mapIndex)),
                              title: Text(blocks[blockIndex].keys.elementAt(mapIndex)),
                              trailing: const Icon(Icons.arrow_forward_ios)
                          ),
                    );
                  },
                  separatorBuilder: (context,mapIndex){
                    return const Divider(
                      height: 2.0,
                      color: Color(0xffd7d1d1),
                    );
                  },
                ),
            );
      },
    );
  }

  void _handleItemClick(String title){
    switch(title){
      case '开源众包':
        break;
    }
  }
}

