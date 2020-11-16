package fun.sec4.bypassUtil;


import java.security.Signature;

// 存放fake签名信息的类
//签名信息以字符串形式存放，待使用时将其转化为Signature数组
public class FakeInfo {
    private static Signature[] signature = null;
    private final static String sigstr = "";

    FakeInfo(){
        sig2siga(sigstr,signature);
    }

    public static void sig2siga(String sig,Signature[] siga){
        //TODO   sig - > siga[]
    }

    public static Signature[] getSig(){
        return signature;
    }

}
