package com.example.myapplication4;

import java.util.ArrayList;

public class datahelper {
        public static ArrayList<listviewteam> provideItems(){
            ArrayList<listviewteam> list = new ArrayList<>();
            list.add(new listviewteam(R.drawable.androiid, "androiid", android.R.color.holo_blue_bright));
            list.add(new listviewteam(R.drawable.tren, "directions subway", android.R.color.background_dark ));
            list.add(new listviewteam(R.drawable.ic_pan_tool_black_24dp, "pan tool", android.R.color.darker_gray));
            list.add(new listviewteam(R.drawable.child, "child care", android.R.color.holo_blue_dark));
            list.add(new listviewteam(R.drawable.avion, "local irpot", android.R.color.holo_green_dark));
            list.add(new listviewteam(R.drawable.re, "record voice over", android.R.color.holo_orange_dark));
            list.add(new listviewteam(R.drawable.dir, "directions bike", android.R.color.holo_purple));
            list.add(new listviewteam(R.drawable.not, "notifications active", android.R.color.holo_red_dark));
            list.add(new listviewteam(R.drawable.sol, "wb sunny", android.R.color.holo_red_light));


            return list;
        }

}
