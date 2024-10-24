package access_specifier.mypack;

import access_specifier.pack.APublic;

public class BPublic {
    public static void main(String[] args) {
        APublic obj = new APublic();
        obj.msg();
    }
}
