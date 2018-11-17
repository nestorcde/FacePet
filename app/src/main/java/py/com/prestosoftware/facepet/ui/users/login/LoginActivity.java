package py.com.prestosoftware.facepet.ui.users.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import py.com.prestosoftware.facepet.R;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    @BindView(R.id.edtEmail) EditText mEdtEmail;

    @BindView(R.id.edtPassword) EditText mEdtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Binding de los componentes de la UI
        ButterKnife.bind(this);
    }

    //Local Methods
    @OnClick(R.id.btnLogin)
    public void loginUser(){
        String email = mEdtEmail.getText().toString();
        String pass = mEdtPassword.getText().toString();
        if(!email.isEmpty() && !pass.isEmpty()) {

            Log.d(TAG, email);
            Log.d(TAG, pass);
        }
    }
}
