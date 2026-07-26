

                      //Q1. Level 1 (Easy) - charAt() print first character.

// public class sstringBuilderss {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Easy");
//             System.out.println(sb.charAt(0));

//     }
    
// }
                        //Q2.String "Programming" pring last character.
                
//  public class sstringBuilderss {
//      public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Programming");
//         StringBuilder sbs = new StringBuilder("Tony");
        
//         System.out.println( sbs.length());
//         System.out.println( sb.length());
//        System.out.println(sb.charAt(10));
//      }
//  }
//                     //Q3. String "Computer" print 4th character.
//       public class sstringBuilderss {
//         public static void main(String[] args) {
//             StringBuilder sb = new StringBuilder("Computer");
//             System.out.println(sb.charAt(4));
//         }
// // }
//                     //Q4. "OPENAI" PRINT ONE BY ON USING LOOP.  
                     // public class sstringBuilderss {
                     //    public static void main(String[] args) {
                     //        StringBuilder sb = new StringBuilder("OPENAI");
                     //         for (int i = 0; i < sb.length(); i++){
                     //            System.out.println(sb.charAt(i));
                     //         }
                             
                     //    }
                     // }

                               //Q5.Print each character with its index.
   
      //  public class sstringBuilderss {
      //    public static void main(String[] args) {
            //  StringBuilder name = new StringBuilder("OPENAI");

            //     for (int i = 0; i<name.length(); i++){
                
            //         System.out.println(i + "->" +name.charAt(i));
                   
            //       }
                    
            //     }
              
            //       }
                
    //                   //Q6.Count the total number of characters.

    // public class sstringBuilderss {
    //   public static void main(String[] args) {
    //       StringBuilder sb = new StringBuilder("Computer");
    //       System.out.println(sb.length());
    //   }
    // }
                    //Q7.Print only characters at even indexes.
    // public class sstringBuilderss {
    //   public static void main(String[] args) {
    //       StringBuilder sb = new StringBuilder("Shahrukh khan");

    //       for(int i = 0 ; i<sb.length(); i++){
    //         if(i % 2 == 0){
    //             System.out.println(sb.charAt(i));
    //         }
//     //       }
// }
// // }
//                                   //Q8.Print only characters at odd indexes.
//             public class sstringBuilderss {
//               public static void main(String[] args) {
//               StringBuilder sb = new StringBuilder("Shahrukh Khan");
   
//               for(int i = 0; i<sb.length(); i++){
//                 if(i % 2 != 0){
//                   System.out.println(sb.charAt(i));

//                 }
//               }

//               }
//             }
                        //Q9.Print the string in reverse without using reverse().

            //  public class sstringBuilderss {
            //   public static void main(String[] args) {
            //       StringBuilder sb = new StringBuilder("Shakrukh Khan");
            //       for(int i = sb.length() - 1 ; i>=0; i--){
            //         System.out.print(sb.charAt(i));
            //       }
                 
            //   }
            //  }

            //   sb.reverse();
                  //System.out.println(sb);
                                        //Level - 2.
                                        //Q - 10. Convert "Tony" into "Pony". 
          //    public class sstringBuilderss {
          //      public static void main(String[] args) {
          //       StringBuilder name = new StringBuilder("Tony");
          //       name.setCharAt(0,'P');
          //       System.out.println(name);
          //    }  
          // }
                                  //Q-11. Convert "Hello" into "Yello".
              //  public class sstringBuilderss {
              //   public static void main(String[] args) {
              //    StringBuilder name = new StringBuilder("Hello");  
              //    name.setCharAt(0, 'Y');
              //    System.out.println(name);
              //   }
              // }
                                    //Q-12.Convert "Java" into "JavX".
            //       public class sstringBuilderss {
            //    public static void main(String[] args) {
            //     StringBuilder name = new StringBuilder("Java");
            //     name.setCharAt(3,'X');
            //     System.out.println(name);
            //   }
            // }
                                    //Q-13. Replace every 'a' with '@'.
                    //  public class sstringBuilderss {
                    //   public static void main(String[] args) {
                    //       StringBuilder name = new StringBuilder("Banana");
                    //       for(int i =0; i<name.length(); i++){
                    //         if(name.charAt(i) %2 == 0){
                             
                    //           System.out.print("@");
                    //           System.out.print(name.charAt(i));
                    //         }
                    //       }
                    //     //  name.setCharAt(1, '@');
                    //     //   name.setCharAt(3, '@');
                    //     //   name.setCharAt(5,'@');
                    //     //   System.out.println(name);

                    //   }
                    //  }
                              //     //Q.14 Replace every vowel with '*'.Input: Education

                              // public class sstringBuilderss {
                              //   public static void main(String[] args) {
                              //      StringBuilder sb = new StringBuilder("Education");
                                   
                              //      for (int i = 0; i<sb.length(); i++){
                              //       char ch = sb.charAt(i);

                              //       if(ch  == 'a'|| ch == 'e'||ch == 'i' || ch == 'o' || ch == 'u'||
                              //      ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U' ) {
                                    
                              //         sb.setCharAt(i, '*');
                                     

                              //       }
                                    
                              //      }
                              //       System.out.println(sb);

                              //   }
                              // }

                                      //Q.15.Replace every lowercase letter with 'X'.
                          //  public class sstringBuilderss {
                          //   public static void main(String[] args) {
                          //       StringBuilder sb = new StringBuilder("SidDh12334ArtH");
                          //       for(int i = 0; i<sb.length(); i++){
                          //         char ch = sb.charAt(i);
                          //         if(ch >='a' && ch <= 'z'){
                          //           sb.setCharAt(i , 'X');

                          //         }
                          //       }
                          //       System.out.println(sb);
                          //   }
                          //  }

                                //Q.16.Replace every uppercase letter with '*'.
                              // public class sstringBuilderss {
                              //   public static void main(String[] args) {
                              //       StringBuilder sb = new StringBuilder("SiDdHArt1234H kUmAR");
                              //       for(int i =0; i<sb.length(); i++){
                              //         char ch = sb.charAt(i);
                              //         if (ch >='A' && ch <='Z'){
                              //           sb.setCharAt(i, '*');
                              //         }
                              //       }
                              //       System.out.println(sb);
                              //   }

                              // }
                              //Q.17.Swap the hello and olleH characters.
                      // public class sstringBuilderss {
                      //   public static void main(String[] args) {
                      //       StringBuilder sb = new StringBuilder("Hello");
                      //     for (int i = sb.length() -1; i>=0; i--){
                      //        System.out.print(sb.charAt(i));
                            

                      //     }
                      //       // sb.reverse();
                      //       // System.out.println(sb);
                      //   }
                      // }
                                      //Q.18.Swap the first and last characters.
                      // public class sstringBuilderss {
                      //   public static void main(String[] args) {
                      //       StringBuilder sb = new StringBuilder("Welcome");
                      //       sb.setCharAt(0, 'e');
                      //       sb.setCharAt(6, 'W');
                      //       System.out.println(sb);
                      //   }
                      // }
                                  //Q.19 .Convert "java" to "JAVA" without toUpperCase().
                              //  public class sstringBuilderss {
                              //   public static void main(String[] args) {
                              //       StringBuilder sb =new StringBuilder("java");
                              //       sb.setCharAt(0,'J');
                              //       sb.setCharAt(1,'A');
                              //       sb.setCharAt(2,'V');
                              //       sb.setCharAt(3,'A');
                              //       //sb.toUpperCase();
                              //       System.out.println(sb);
                                    
                              //   }
                              //  }
                                  //Q.20.Convert "PROGRAM" to "program" without toLowerCase().
                                // public class sstringBuilderss {
                                //   public static void main(String[] args) {
                                //       StringBuilder sb = new StringBuilder("PROGRAM");
                                //       for(int i =0; i<+1; i++){
                                //         System.out.println("program");
                                //       }
                                //       // sb.setCharAt(0, 'p');
                                //       //  sb.setCharAt(1, 'r');
                                //       //   sb.setCharAt(2, 'o');
                                //       //    sb.setCharAt(3, 'g');
                                //       //     sb.setCharAt(4, 'r');
                                //       //      sb.setCharAt(5, 'a');
                                //       //       sb.setCharAt(6, 'm');
                                //       //       System.out.println(sb);
                                            
                                //   }
                                // }
                                  //LEVEL -3 
                                  //Q.21.Append " World" to "Hello".
                          //  public class sstringBuilderss {
                          //   public static void main(String[] args) {
                          //     StringBuilder sb = new StringBuilder("WORLD");
                          //     sb.append(" " + "HELLO");
                          //     System.out.println(sb);
                                
                          //   }
                          //  }    

                           //Q.22 .Create an empty StringBuilder and append "Java".

                          //      public class sstringBuilderss {
                          //   public static void main(String[] args) {
                          //     StringBuilder sb = new StringBuilder();
                          //     sb.append("");
                          //     System.out.println(sb);
                                
                          //   }
                          //  }  
                                  //Q.23.Append numbers 1 to 10.
                          
                            //     public class sstringBuilderss {
                            //  public static void main(String[] args) {
                            //   StringBuilder sb = new StringBuilder("1");
                            //   sb.append( " " + "2 3 4 5 6 7 8 9 10");
                            //   System.out.println(sb);
                            // //   for(int i =1; i<=10; i++){
                            // //       System.out.print(i);
                            // //   }
                            //   }
                            // }
                            //Q.24.Append alphabets A to Z.
                      // public class sstringBuilderss {
                      //         public static void main(String[] args) {
                      //          StringBuilder sb = new StringBuilder("A");
                      //          sb.append(" " + "B C D E F G H I J K L M N O P Q R S T U V W X Y Z ");
                      //          System.out.println(sb);
                      //         }
                      //       }  

                                    //Q.24.convert loert case to upper case with the help my toUpperCase method..
                      //  public class sstringBuilderss {
                      //        public static void main(String[] args) {
                      //           StringBuilder sb = new StringBuilder("siddharth");
                      //           System.out.println(sb.toString().toUpperCase());
                      //        }
                      //       }
                            //Q.25.Append all even numbers from 2 to 20.
                      //  public class sstringBuilderss {
                      //         public static void main(String[] args) {
                      //           StringBuilder sb = new StringBuilder();
                      //          for(int i = 1; i<=20; i++){
                      //           if(i % 2 == 0){
                      //             sb.append(i);
                      //           }
                      //          }
                      //            System.out.println(sb);

                      //         }
                      //       }
                              //Q.26.Append "!" five times.Output:!!!!! .
                      //  public class sstringBuilderss {
                      //          public static void main(String[] args) {
                      //            StringBuilder sb = new StringBuilder();
                      //            sb.append("!!!!!");
                      //            System.out.println(sb);
                                 
                      //          }
                      //         }
                          //Q.27.Create the string "ABCDE" using a loop and append().
                      // public class sstringBuilderss {
                      //           public static void main(String[] args) {
                      //             StringBuilder sb = new StringBuilder();
                      //             for(char ch ='A' ;   ch <='E'; ch++){
                      //               sb.append(ch);
                                    
                      //             }
                      //             System.out.println(sb);
                      //           }
                      //         }
                                    //Level 4: insert()
                                //Q.28.Insert "Core " before "Java".Output:Core Java
                      // public class sstringBuilderss {
                      //            public static void main(String[] args) {
                      //       StringBuilder sb= new StringBuilder("Java");
                      //       sb.insert(0,"Core" + " ");
                      //       System.out.println(sb);
                      // }
                      // }
                            //           //Q.28.Insert 'X' at index 2.input:Hello output: HeXllo.
                            //  public class sstringBuilderss {
                            //       public static void main(String[] args) {
                            //  StringBuilder sb= new StringBuilder("Hello");  
                            //  sb.insert(2,'X');
                            //  System.out.println(sb);
                            //       }
                            //     } 
                                    //Q.29.Insert "123" at the beginning.
                  // public class sstringBuilderss {
                  //   public static void main(String[] args) {
                  //       StringBuilder sb = new StringBuilder(" " + "Hello");
                  //       sb.insert(0, "1 2 3");
                  //       System.out.println(sb);
                  //   }
                  // }
                              //Q.30.Insert "End" at the end.

                    // public class sstringBuilderss {
                    //   public static void main(String[] args) {
                    //       StringBuilder sb = new StringBuilder("Hello");
                    //       sb.insert(5," " + "end");
                    //       System.out.println(sb);
                    //   }
                    // }
                            //Q.31.Insert a space between "Hello" and "World".
                      //   public class sstringBuilderss {
                      //  public static void main(String[] args) {
                      //   StringBuilder sb = new StringBuilder("Helloworld");
                      //    sb.insert(5, " "); 
                      //   System.out.println(sb);
                      //  }
                      // }
                        //         //Q.32.Insert '-' after every character.
                        // public class sstringBuilderss {
                        // public static void main(String[] args) {
                        //   StringBuilder sb = new StringBuilder("Hello");
                        //     sb.insert(1, '_');
                        //     sb.insert(3, '_');
                        //     sb.insert(5,'_');
                        //     sb.insert(7,'_');
                        //     System.out.println(sb);
                        // }
                        // }
                                //Q.33.Input JAVA output J-A-V-A- .
                        // public class sstringBuilderss {
                        //  public static void main(String[] args) {
                        //   StringBuilder sb = new StringBuilder("JAVA");
                        //   sb.insert(1,'-');
                        //   sb.insert(3,'-');
                        //   sb.insert(5,'-');
                        //   sb.insert(7,'-');
                        //   System.out.println(sb);
                        //  }
                        // }
                                //Level 5: delete() & deleteCharAt() 
                              //Q.34.Delete "World" from "HelloWorld".
                // public class sstringBuilderss {
                //           public static void main(String[] args) {
                //                 StringBuilder sb = new StringBuilder("HelloWorld");
                //                 sb.delete(5, 10);
                //                 System.out.println(sb);
                //           }
                //         }
                                //Q.35.Delete the first character.
                // public class sstringBuilderss {
                //       public static void main(String[] args) {
                //         StringBuilder sb = new StringBuilder("Hello");
                //         sb.deleteCharAt(0);
                //         System.out.println(sb);
                //       }
                // }
                                //Q.35.Delete all vowels.Input - Education Output - dectn.
                        public class sstringBuilderss {
                       public static void main(String[] args) {
                         StringBuilder sb = new StringBuilder("Education");   
                         
                             for(int i=0; i<sb.length(); i++){
                                char ch = sb.charAt(i);
                         if(ch == 'A' || ch == 'E'||ch == 'I'||ch == 'O' ||ch == 'U' ||
                           ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o' ||ch == 'u' ){
                              
                                        sb.deleteCharAt(i);
                                }
                             }       
                             
                                System.out.println(sb);
                       }
                }
