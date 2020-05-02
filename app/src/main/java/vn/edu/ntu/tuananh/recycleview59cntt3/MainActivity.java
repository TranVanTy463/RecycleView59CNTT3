package vn.edu.ntu.tuananh.recycleview59cntt3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import vn.edu.ntu.tuananh.model.Product;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Lớp cài đặt cho việc hiển thị của một Product
    private class ProductViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtName, txtPrice, txtDesc;
        ImageView imBtnCart;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = this.itemView.findViewById(R.id.txtName);
            txtPrice = this.itemView.findViewById(R.id.txtPrice);
            txtDesc = this.itemView.findViewById(R.id.txtDesc);
            imBtnCart = this.itemView.findViewById(R.id.imBtnCart);
        }
        public void bind(Product p)
        {
            txtName.setText(p.getName());
            txtPrice.setText(new Integer(p.getPrice()).toString());
            txtDesc.setText(p.getDesc());
            imBtnCart.setImageResource(R.drawable.ic_action_add_to_cart);
        }
    }

    // Lớp adapter kết nối RecycleView và dữ liệu
    private class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>
    {
        ArrayList<Product> listProduct;

        public ProductAdapter(ArrayList<Product> listProduct) {
            this.listProduct = listProduct;
        }

        //Tạo một ViewHolder để hiển thị dữ liệu
        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            // Chuyển layout thiết đã thiết kế bằng xml thành một đối tượng View
            View view = layoutInflater.inflate(R.layout.product_item,
                    parent, false);
            return new ProductViewHolder(view);
        }

        // Kết nối một mục dữ liệu trong danh sách với một ViewHolder
        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        }

        @Override
        public int getItemCount()
        {
            return listProduct.size();
        }
    }
}
