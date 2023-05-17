package madhuri.com.bookstore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class addActivity extends AppCompatActivity {

    EditText title_input, author_input, pages_input;
    Button save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.book_name);
        author_input =findViewById(R.id.author_name);
        pages_input = findViewById(R.id.pages_name);
        save_button = findViewById(R.id.save_button);
        
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper MyDB = new MyDatabaseHelper(addActivity.this);
                MyDB.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim(),
                        Integer.valueOf(pages_input.getText().toString()));
            }
        });
    }

}