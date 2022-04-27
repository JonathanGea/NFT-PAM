package com.sento.tr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class home extends Fragment {
    View view;
GridView gridview,gridview1,gridview2;
    String[] names = {"Hutou", "sucrose","ganyu","kaguya", "shinomiya","siruka"};
    String[] details = {"\n" +
            "\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer id arcu a diam sagittis eleifend nec ut lorem. Vestibulum scelerisque odio et lacus fringilla, ac bibendum erat commodo. In at purus ultricies, commodo sem eget, vestibulum est. Integer nec lorem nec tortor dignissim maximus. Nunc lacus massa, fringilla eget nisl vitae, ornare placerat est. Maecenas vulputate tincidunt enim, mattis consequat ex egestas vel. Praesent ut ullamcorper tellus, quis feugiat arcu. Fusce convallis tempor lacus. Nullam faucibus, arcu sed dapibus sagittis, justo sem convallis lectus, eget faucibus nisi odio a nibh. Aliquam a accumsan tellus. Sed sit amet auctor diam, et rutrum ipsum. Duis eget quam a velit dictum elementum placerat eget ex. ",
            "Donec nisi diam, gravida non felis sed, laoreet aliquam lacus. Sed eget neque ut nisl cursus cursus ac ac lacus. Aliquam velit leo, finibus quis nunc nec, consequat molestie nisi. Nullam congue, orci sit amet egestas vestibulum, orci elit vulputate libero, a rutrum eros neque sit amet tortor. Duis dolor neque, scelerisque vitae ligula a, placerat volutpat nisl. Fusce eu bibendum lorem, quis vulputate ligula. Quisque eros quam, porttitor et ornare non, mattis nec est. ",
            "Donec nisi diam, gravida non felis sed, laoreet aliquam lacus. Sed eget neque ut nisl cursus cursus ac ac lacus. Aliquam velit leo, finibus quis nunc nec, consequat molestie nisi. Nullam congue, orci sit amet egestas vestibulum, orci elit vulputate libero, a rutrum eros neque sit amet tortor. Duis dolor neque, scelerisque vitae ligula a, placerat volutpat nisl. Fusce eu bibendum lorem, quis vulputate ligula. Quisque eros quam, skfnlsfnslfnsfnlskefnklsenflksen ",
            "Donec nisi diam, gravida non felis sed, laoreet aliquam lacus. Sed eget neque ut nisl cursus cursus ac ac lacus. Aliquam velit leo, finibus quis nunc nec, consequat molestie nisi. Nullam congue, orci sit amet egestas vestibulum, orci elit vulputate libero, a rutrum eros neque sit amet tortor. Duis dolor neque, scelerisque vitae ligula a, placerat volutpat nisl. Fusce eu bibendum lorem, quis vulputate ligula. Quisque eros quam, porttitor et ornare non, mattis nec est. ",
            "Donec nisi diam, gravida non felis sed, laoreet aliquam lacus. Sed eget neque ut nisl cursus cursus ac ac lacus. Aliquam velit leo, finibus quis nunc nec, consequat molestie nisi. Nullam congue, orci sit amet egestas vestibulum, orci elit vulputate libero, a rutrum eros neque sit amet tortor. Duis dolor neque, scelerisque vitae ligula a, placerat volutpat nisl. Fusce eu bibendum lorem, quis vulputate ligula. Quisque eros quam, porttitor et ornare non, mattis nec est. ",
            "Duis interdum sit amet mauris ac imperdiet. Donec eget sem eu nisl interdum vestibulum et nec dolor. Etiam eu mauris sit amet purus convallis vehicula. Aenean facilisis tempus diam, ut aliquet tortor dictum ut. Phasellus sed ullamcorper magna, et imperdiet turpis. Suspendisse mollis feugiat metus. Sed semper quam in purus volutpat dapibus. Cras eget vehicula neque. Phasellus luctus libero accumsan lobortis pellentesque. Sed diam lacus, venenatis ac accumsan vel, vestibulum vitae nibh. Vivamus malesuada dictum euismod. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. "};
    String[] prices = {"0.1","0.3","0.5","0.1","0.3","0.5"};
    String[] pemilik = {"sa","kuro","shiro","red","kusi","maka"};
    int[] images ={R.drawable.hutou,R.drawable.sucrose,R.drawable.ganyu,R.drawable.foto1_1,R.drawable.foto1_2,R.drawable.foto1_3};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home, container, false);
        gridview = view.findViewById(R.id.gridViewGallery);
        CustomAdapter custom = new CustomAdapter();
        gridview.setAdapter(custom);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            Intent intent = new Intent(getActivity().getApplicationContext(),detail.class);
                                            intent.putExtra("nama",names[i]);
                                            intent.putExtra("harga",prices[i]);
                                            intent.putExtra("image1",images[i]);
                                            intent.putExtra("detail",details[i]);
                                            intent.putExtra("pemilik",pemilik[i]);
                                            startActivity(intent);
                                        }
                                    }
        );

        gridview1 = view.findViewById(R.id.gridViewGallery1);
        CustomAdapter custom1 = new CustomAdapter();
        gridview1.setAdapter(custom1);
        gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                Intent intent1 = new Intent(getActivity().getApplicationContext(),detail.class);
                                                intent1.putExtra("nama",names[i]);
                                                intent1.putExtra("harga",prices[i]);
                                                intent1.putExtra("image1",images[i]);
                                                intent1.putExtra("detail",details[i]);
                                                intent1.putExtra("pemilik",pemilik[i]);
                                                startActivity(intent1);
                                            }
                                        }
        );

        gridview2 = view.findViewById(R.id.gridViewGallery2);
        CustomAdapter custom2 = new CustomAdapter();
        gridview2.setAdapter(custom2);
        gridview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                Intent intent2 = new Intent(getActivity().getApplicationContext(),detail.class);
                                                intent2.putExtra("nama",names[i]);
                                                intent2.putExtra("harga",prices[i]);
                                                intent2.putExtra("image1",images[i]);
                                                intent2.putExtra("detail",details[i]);
                                                intent2.putExtra("pemilik",pemilik[i]);
                                                startActivity(intent2);
                                            }
                                        }
        );
        return view;
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           View view1 = getLayoutInflater().inflate(R.layout.item, null);
            TextView name = view1.findViewById(R.id.name);
            TextView price = view1.findViewById(R.id.price);
            ImageView image = view1.findViewById(R.id.imgdt);


            name.setText(names[i]);
            price.setText(prices[i]);
            image.setImageResource(images[i]);

            return view1;
        }
    }
}
