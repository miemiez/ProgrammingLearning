import 'package:flutter/material.dart';

// ignore: must_be_immutable
class CardTest extends StatelessWidget{
  String image;
  String title;
  String details;
  CardTest(this.image,this.title,this.details,{super.key});

  @override
  Widget build(BuildContext context){
    final containerWidth = MediaQuery.of(context).size.width;

    return Card(
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10),
          ),
          elevation: 20,
          margin: const EdgeInsets.all(10),
          child: Column(
            children: [
              AspectRatio(
                aspectRatio: 16/9,
                child: Image.asset(image,fit: BoxFit.fill,),
              ),
              ListTile(
                  //contentPadding: EdgeInsets.symmetric(vertical: 10), #要增加 ListTile 的上下内边距，可以通过这种方式调整
                  //dense: true, #如果将 dense 设置为 true，则 ListTile 的垂直间距将减小。这将使得 ListTile 更加紧凑。
                  leading: CircleAvatar(
                  radius: 40,
                  backgroundImage: AssetImage(image),
                ),
                title: Text(title),
                subtitle: Text(details))
            ]
                ),
              )
    ;
  }
}

// Card(
//       shape: RoundedRectangleBorder(
//         borderRadius: BorderRadius.circular(20),
//       ),
//       elevation: 20,
//       child: SizedBox(
//         width: containerWidth-20,
//         height: 250,
//         child: Column(
//           children: [
//             Expanded(
//               flex: 2,
//               child: Container(
//                 alignment: Alignment.center,
//                 child: Image.asset(image,fit: BoxFit.fill),
//               )
//             ),
//             const Divider(),
//             Expanded(
//               flex: 1,
//               child: SizedBox(
//                 height: 200,
//                 child: Row(
//                   children: [
//                     Container(
//                       padding: const EdgeInsets.all(10),
//                       child: SizedBox(
//                         child: 
//                           Positioned(
//                             left: 15,
//                             bottom: 10,
//                             child: CircleAvatar(
//                               radius: 40,
//                               backgroundImage: AssetImage(image)
//                             )
//                           ),
//                       )
//                     ),
//                     Container(
//                       alignment: Alignment.center,
//                       child: const Column(
//                         children: [
//                           Text('title'),
//                           Text('details'),
//                         ]
//                       ),
//                     ),
//                   ],
//                 )
//             )
//             )
//           ],
//       ),)
//     );