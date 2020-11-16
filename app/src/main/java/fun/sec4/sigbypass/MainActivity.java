package fun.sec4.sigbypass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取当前程序的签名信息,通过log输出
        try{
            int sigVar = getPackageManager().getPackageInfo(getPackageName(),PackageManager.GET_SIGNATURES).signatures[0].hashCode();
            Log.e("SigBypass log","当前签名信息:"+sigVar);
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }
}