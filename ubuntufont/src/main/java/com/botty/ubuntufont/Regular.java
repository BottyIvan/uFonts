package com.botty.ubuntufont;

/**
 * Created by BottyIvan on 01/10/15.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.botty.ubuntufont.Typefaces;

public class Regular extends TextView {

        public Regular(Context context, AttributeSet attrs, int defStyle)
        {
            super(context, attrs, defStyle);
            init(context);
        }

        public Regular(Context context, AttributeSet attrs)
        {
            super(context, attrs);
            init(context);
        }

        public Regular(Context context)
        {
            super(context);
            init(context);
        }

    private void init(Context c)
    {
        setTypeface(Typefaces.get(getContext(), "font/Ubuntu-R.ttf"));
    }

}