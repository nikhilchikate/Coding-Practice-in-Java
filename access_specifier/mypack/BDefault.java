package access_specifier.mypack;

import access_specifier.pack.*;

//public class BDefault {
//    public static void main(String[] args) {
//        ADefault obj = new ADefault();
//        obj.msg(); // Compile Time Error
//    }
//}

/*
.\BDefault.java:3: error: package access_specifier.pack does not exist
import access_specifier.pack.*;
^
.\BDefault.java:7: error: cannot find symbol
        ADefault obj = new ADefault();
        ^
  symbol:   class ADefault
  location: class BDefault
.\BDefault.java:7: error: cannot find symbol
        ADefault obj = new ADefault();
                           ^
  symbol:   class ADefault
  location: class BDefault
3 errors
*/
