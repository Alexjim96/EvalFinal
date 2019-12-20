package mx.unam.dgtic.p1.evalfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import mx.unam.dgtic.p1.evalfinal.modelo.Productos;

public class MainActivity extends AppCompatActivity {
    String[] nombresProd = {"Mochila moderna","Smartwatch","Bocinas bluetooth","Powerbank","GoPro",
                            "Impresora","Celular","Pantalla","Laptop","Consola gamer"} ;
    String[]  vendedor = {"Redlemon","KOSCHEAL","Redlemon","YICF","GoPro","polaroid","Samsung",
                            "Pyle","DELL","Sony"};
    String[] marca = {"Redlemon sv","KOSC","lemon","YICF","Pro","polaroid inc","Sams",
            "Mark II","Alinware","Sony ind."};
    Boolean[] disp = {true,true,true,true,false,true,true,false,true,true};
    Double[] precio = {645.50,759.60,764.0,499.90,300.0,2011.45,7499.99,1499.69,50478.94,5489.9} ;
    String[] imgProd = {"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG","6.PNG","7.PNG","8.PNG","9.PNG","10.PNG"};

    ArrayList<Productos> productos = new ArrayList<>();

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productos = datosProd();
        final Adaptador adaptador = new Adaptador(this,productos);

        lv = findViewById(R.id.lv);

        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putLong("ID",l);

                Productos tmp = (Productos) adapterView.getItemAtPosition(i);

                bundle.putString("Nombre",tmp.getNombre());
                bundle.putDouble("Precio",tmp.getPrecio());
                bundle.putString("Vendedor",tmp.getVendedor());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    private ArrayList<Productos> datosProd(){
        ArrayList<Productos> nuevos = new ArrayList<>();
        Productos prod;
        for (int i = 0;i<10;i++){
            prod = new Productos(i,nombresProd[i],marca[i],vendedor[i],disp[i],precio[i]);
            nuevos.add(prod);
        }
        return nuevos;
    }
}
