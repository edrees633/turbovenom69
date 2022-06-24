package com.example.turbovenom69;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PartDetailsActivity extends AppCompatActivity {

    private TextView tvBrand, tvModelyear, tvDescription,tvCategory;
    private ImageView ivPhoto;

    /*
        private String address;
    private RestCat category;
    private String photo;
    private String phone;
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_details);

        connectComponents();
        Intent i = this.getIntent();
        Part part = (Part) i.getSerializableExtra("part");

        tvBrand.setText(part.getBrand());
        tvModelyear.setText(part.getModelyear());
        tvDescription.setText(part.getDescription());
        tvCategory.setText(part.getCategory().toString());
        Picasso.get().load(part.getPhoto()).into(ivPhoto);
    }

    private void connectComponents() {
        tvBrand = findViewById(R.id.tvBrandPartDetails);
        tvDescription = findViewById(R.id.tvDescriptionPartDetails);
        tvModelyear = findViewById(R.id.tvModelyearPartdetails);
        tvCategory = findViewById(R.id.tvCategoryPartDetails);
        ivPhoto = findViewById(R.id.ivPhotoPartDetails);
    }
}