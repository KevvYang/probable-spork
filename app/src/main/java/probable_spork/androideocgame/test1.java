package probable_spork.androideocgame;
import java.util.ArrayList<E>;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class test1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }
    public void yosuck(View view) {
        Toast.makeText(this, R.string.randomText, Toast.LENGTH_SHORT).show();
    }
    public void 1(View view) {
        Toast.makeText(this, R.string.one, Toast.LENGTH_SHORT).show();
    }
    public void 2(View view) {
        Toast.makeText(this, R.string.two, Toast.LENGTH_SHORT).show();
    }
    public void 3(View view) {
        Toast.makeText(this, R.string.three, Toast.LENGTH_SHORT).show();
    }
    public void 4(View view) {
        Toast.makeText(this, R.string.four, Toast.LENGTH_SHORT).show();
    }

    public void number(View view) {
        /**
        if(Math.random() >= 0.5) {
            Toast.makeText(this, R.string.yes, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.no, Toast.LENGTH_SHORT).show();
        }*/
        ArrayList<Integer> sequence = new ArrayList<Integer>(10);
        while(true){
            int rand = (int)(Math.random()*4)+1;

           }
    }
}
