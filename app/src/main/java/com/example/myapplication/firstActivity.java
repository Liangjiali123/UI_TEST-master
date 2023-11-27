package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class firstActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button,button1;
    private TextView textView;
    private Fragment leftFragment,rightFragment;
    private FrameLayout right,left;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {// @Nullable它们帮助您控制整个方法层次结构中的合约，如果 IntelliJ IDEA 发现合约被违反，它将报告检测到的问题，并指出 NullPointerException 可能发生的代码。消除空指针异常
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

//        rightFragment rightFragment = (rightFragment)getSupportFragmentManager().
//                                      findFragmentById(R.id.right);//从布局文件中获取fragment实例

        ini();
    }
/*
 *FragmentActivity （getSupportFragmentManager）
 *Fragmentmanager （beginTrasacation() ）
 *FragmentTransacation  （add()，replace(),remove(), commit(),  addToBackStack() ）
 */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                replacefragment(right,leftFragment);
//                Toast.makeText(this,"nothing",Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                replacefragment(left, rightFragment);
//                Toast.makeText(this,"watting......",Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }

    }

    private void ini() {
        button = findViewById(R.id.button2);
        button.setOnClickListener(this);
        button1 = findViewById(R.id.button3);
        button1.setOnClickListener(this);
        textView = findViewById(R.id.textView2);
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        leftFragment = new LeftFragment();
        rightFragment = new rightFragment();
    }

    private void replacefragment(View view,Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();//开启事务
        fragmentTransaction.replace(view.getId(), fragment, null);
        /*
         *将此事务添加到后堆栈。这意味着交易
         *在提交后将被记住，并将反转其操作
         *后来从堆栈中弹出。
         *<p>
         *{@link#setReorderingAllowed（boolean）}必须设置为<code>true
         *在与addToBackStack（）相同的事务中，允许该
         *要重新排序的事务。
         *@param name此后堆栈状态的可选名称，或null。
         */
        fragmentTransaction.addToBackStack(null);//类似activity返回栈效果
        fragmentTransaction.commit();//提交事务
    }



}
/*
 *onAttach() 当Fragment和Activity建立关联时调用。
 *onCreateView() 为Fragment创建视图（加载布局）时调用。
 *onActivityCreated() 确保与Fragment相关联的Activity已经创建完毕时调用。
 *onDestroyView() 当与Fragment关联的视图被移除时调用。
 *onDetach() 当Fragment和Activity解除关联时调用。
 */