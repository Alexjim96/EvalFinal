package mx.unam.dgtic.p1.evalfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.unam.dgtic.p1.evalfinal.modelo.Productos;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context context;
    ArrayList<Productos> productos;

    public Adaptador(Context context, ArrayList<Productos> productos) {
        this.context = context;
        this.productos = productos;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int i) {
        return productos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.cell_prototype,null);

        TextView tvNombre = vista.findViewById(R.id.tvNombre);
        TextView tvVendedor = vista.findViewById(R.id.tvVendedor);
        TextView tvMarca = vista.findViewById(R.id.tvMarca);
        TextView tvPrecio = vista.findViewById(R.id.tvPrecio);
        TextView tvDisponible = vista.findViewById(R.id.tvDisponible);
        ImageView ivPrev = vista.findViewById(R.id.ivPrev);

        tvNombre.setText(productos.get(i).getNombre());
        tvVendedor.setText(productos.get(i).getVendedor());
        tvMarca.setText(productos.get(i).getMarca());
        tvPrecio.setText("$"+String.valueOf(productos.get(i).getPrecio()));
        tvDisponible.setText(productos.get(i).isDisponible()?"Disponible":"No disponible");
        switch (i+1){
            case 1:
                ivPrev.setImageResource(R.drawable.img1);
                break;
            case 2:
                ivPrev.setImageResource(R.drawable.img2);
                break;
            case 3:
                ivPrev.setImageResource(R.drawable.img3);
                break;
            case 4:
                ivPrev.setImageResource(R.drawable.img4);
                break;
            case 5:
                ivPrev.setImageResource(R.drawable.img5);
                break;
            case 6:
                ivPrev.setImageResource(R.drawable.img6);
                break;
            case 7:
                ivPrev.setImageResource(R.drawable.img7);
                break;
            case 8:
                ivPrev.setImageResource(R.drawable.img8);
                break;
            case 9:
                ivPrev.setImageResource(R.drawable.img9);
                break;
            case 10:
                ivPrev.setImageResource(R.drawable.img10);
                break;
            default:
                break;

        }


        return vista;
    }
}
