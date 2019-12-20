package mx.unam.dgtic.p1.evalfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private final static String LOGTAG = "DEPURACION";

    TextView tvNombre;
    TextView tvInfo;
    Button btnCarro, btnNow;
    ImageView ivProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNombre = findViewById(R.id.tvNombre);
        tvInfo = findViewById(R.id.tvInfo);
        btnCarro = findViewById(R.id.btnCarro);
        btnNow = findViewById(R.id.btnNow);
        ivProd = findViewById(R.id.ivProd);

        Bundle bundle = this.getIntent().getExtras();
        Long id = bundle.getLong("ID");
        String nombre = bundle.getString("Nombre");
        String vendedor = bundle.getString("Vendedor");
        Double precio = bundle.getDouble("Precio");
        Log.d(LOGTAG,"El ID del articulo elegido: " +(id+1));

        tvNombre.setText(nombre);
        tvInfo.setText("El articulo seleccionado es vendido por: "+vendedor+
                        " y el precio es $"+precio);
        Log.d(LOGTAG,"El articulo seleccionado es vendido por: "+vendedor+
                " y el precio es $"+precio);

        btnCarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Producto agregado al carrito",Toast.LENGTH_SHORT).show();
            }
        });

        btnNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Procesando de compra...",Toast.LENGTH_SHORT).show();
            }
        });
        switch (Integer.parseInt(""+(id+1))){
            case 1:
                ivProd.setImageResource(R.drawable.img1);
                break;
            case 2:
                ivProd.setImageResource(R.drawable.img2);
                break;
            case 3:
                ivProd.setImageResource(R.drawable.img3);
                break;
            case 4:
                ivProd.setImageResource(R.drawable.img4);
                break;
            case 5:
                ivProd.setImageResource(R.drawable.img5);
                break;
            case 6:
                ivProd.setImageResource(R.drawable.img6);
                break;
            case 7:
                ivProd.setImageResource(R.drawable.img7);
                break;
            case 8:
                ivProd.setImageResource(R.drawable.img8);
                break;
            case 9:
                ivProd.setImageResource(R.drawable.img9);
                break;
            case 10:
                ivProd.setImageResource(R.drawable.img10);
                break;

        }
    }
}
