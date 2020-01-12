package ved.basics.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public String getMyPropery() {
        return myPropery;
    }

    public void setMyPropery(String myPropery) {
        this.myPropery = myPropery;
    }

    private void doSomething(){
        this.setMyPropery(myPropery);
    }

    private String myPropery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
