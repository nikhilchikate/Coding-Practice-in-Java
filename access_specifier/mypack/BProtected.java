package access_specifier.mypack;
import access_specifier.pack.*;

public class BProtected extends AProtected {
    public static void main(String[] args) {
        BProtected obj = new BProtected();
        obj.msg();
    }
}

/*
.\BProtected.java:4: error: cannot find symbol
public class BProtected extends AProtected {
                                ^
  symbol: class AProtected
.\BProtected.java:2: error: package access_specifier.pack does not exist
import access_specifier.pack.*;
^
.\BProtected.java:7: error: cannot find symbol
        obj.msg();
           ^
  symbol:   method msg()
  location: variable obj of type BProtected
3 errors
*/