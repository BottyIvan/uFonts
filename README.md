# uFonts
<img src="https://raw.githubusercontent.com/BottyIvan/uFonts/master/app/screen/BANNER.png">

#Setup
<p>1. Provide the gradle dependency</p>
<pre>
repositories {
    maven {
        url 'http://dl.bintray.com/droidbotty/maven'
    }
}
...
dependencies {
    compile 'com.github.bottyivan:ubuntufont:0.0.4@aar'
}
</pre>

<p>1. Provide the Maven dependency</p>
```xml
<dependency>
    <groupId>com.github.bottyivan</groupId>
        <artifactId>ubuntufont</artifactId>
            <version>0.0.4</version>
                <type>aar</type>
</dependency>
```    
<p>2. Add to your layout</p>

```xml
<com.botty.ubuntufont.Regular
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:text="Your text !"/>
```    
#Costum ActionBar

create a <a href="https://github.com/BottyIvan/uFonts/blob/master/app/src/main/res/layout/toolbar.xml">layout/toolbar.xml</a> 

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/theme_default_primary" >

    <com.botty.ubuntufont.Bold
        android:id="@+id/title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerVertical="true"
        android:layout_marginLeft="10dp"
        android:textSize="20dp"
        android:maxLines="1"
        android:ellipsize="end"
        android:text="" />
</RelativeLayout>
```
extends your activity with Activity

<pre>
public class MainActivity extends Activity {
    
    ....

        this.getActionBar().setDisplayShowCustomEnabled(true);
        this.getActionBar().setDisplayShowTitleEnabled(false);

        LayoutInflater inflator = LayoutInflater.from(this);
        View v = inflator.inflate(R.layout.toolbar, null);

        //if you need to customize anything else about the text, do it here.
        //I'm using a custom TextView with a custom font in my layout xml so all I need to do is set title
        ((TextView)v.findViewById(R.id.title)).setText(this.getTitle());

        //assign the view to the actionbar
        this.getActionBar().setCustomView(v);

    ...
</pre>

edit the style like this:

```xml
    <!-- Base application theme. -->
    <style name="yourAppTheme" parent="android:Theme.DeviceDefault.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        ....
        <item name="android:actionBarStyle">@style/AppTheme.ActionBar</item>
        ....
    </style>

    <style name="yourAppTheme.ActionBar" parent="android:Widget.DeviceDefault.ActionBar.Solid">
        <item name="android:background">@color/colorPrimary</item>
        <item name="android:color">#fff</item>
    </style>
```    
and for support Android 5.0+
```xml
    <!-- Base application theme. -->
    <style name="yourAppTheme" parent="android:Theme.DeviceDefault.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        ...
        <item name="android:actionBarStyle">@style/AppTheme.ActionBar</item>
        <item name="android:statusBarColor">@color/colorPrimaryDark</item>
        <item name="android:colorEdgeEffect">@color/colorAccent</item>
        ...
    </style>

    <style name="yourAppThee.ActionBar" parent="android:Widget.DeviceDefault.ActionBar.Solid">
        <item name="android:background">@color/colorPrimary</item>
        <item name="android:color">#fff</item>
    </style>
```    
#License

<pre>
-------------------------------
UBUNTU FONT LICENCE Version 1.0
-------------------------------

PREAMBLE
This licence allows the licensed fonts to be used, studied, modified and
redistributed freely. The fonts, including any derivative works, can be
bundled, embedded, and redistributed provided the terms of this licence
are met. The fonts and derivatives, however, cannot be released under
any other licence. The requirement for fonts to remain under this
licence does not require any document created using the fonts or their
derivatives to be published under this licence, as long as the primary
purpose of the document is not to be a vehicle for the distribution of
the fonts.

DEFINITIONS
"Font Software" refers to the set of files released by the Copyright
Holder(s) under this licence and clearly marked as such. This may
include source files, build scripts and documentation.

"Original Version" refers to the collection of Font Software components
as received under this licence.

"Modified Version" refers to any derivative made by adding to, deleting,
or substituting -- in part or in whole -- any of the components of the
Original Version, by changing formats or by porting the Font Software to
a new environment.

"Copyright Holder(s)" refers to all individuals and companies who have a
copyright ownership of the Font Software.

"Substantially Changed" refers to Modified Versions which can be easily
identified as dissimilar to the Font Software by users of the Font
Software comparing the Original Version with the Modified Version.

To "Propagate" a work means to do anything with it that, without
permission, would make you directly or secondarily liable for
infringement under applicable copyright law, except executing it on a
computer or modifying a private copy. Propagation includes copying,
distribution (with or without modification and with or without charging
a redistribution fee), making available to the public, and in some
countries other activities as well.

PERMISSION & CONDITIONS
This licence does not grant any rights under trademark law and all such
rights are reserved.

Permission is hereby granted, free of charge, to any person obtaining a
copy of the Font Software, to propagate the Font Software, subject to
the below conditions:

1) Each copy of the Font Software must contain the above copyright
notice and this licence. These can be included either as stand-alone
text files, human-readable headers or in the appropriate machine-
readable metadata fields within text or binary files as long as those
fields can be easily viewed by the user.

2) The font name complies with the following:
(a) The Original Version must retain its name, unmodified.
(b) Modified Versions which are Substantially Changed must be renamed to
avoid use of the name of the Original Version or similar names entirely.
(c) Modified Versions which are not Substantially Changed must be
renamed to both (i) retain the name of the Original Version and (ii) add
additional naming elements to distinguish the Modified Version from the
Original Version. The name of such Modified Versions must be the name of
the Original Version, with "derivative X" where X represents the name of
the new work, appended to that name.

3) The name(s) of the Copyright Holder(s) and any contributor to the
Font Software shall not be used to promote, endorse or advertise any
Modified Version, except (i) as required by this licence, (ii) to
acknowledge the contribution(s) of the Copyright Holder(s) or (iii) with
their explicit written permission.

4) The Font Software, modified or unmodified, in part or in whole, must
be distributed entirely under this licence, and must not be distributed
under any other licence. The requirement for fonts to remain under this
licence does not affect any document created using the Font Software,
except any version of the Font Software extracted from a document
created using the Font Software may only be distributed under this
licence.

TERMINATION
This licence becomes null and void if any of the above conditions are
not met.

DISCLAIMER
THE FONT SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO ANY WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF
COPYRIGHT, PATENT, TRADEMARK, OR OTHER RIGHT. IN NO EVENT SHALL THE
COPYRIGHT HOLDER BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
INCLUDING ANY GENERAL, SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL
DAMAGES, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF THE USE OR INABILITY TO USE THE FONT SOFTWARE OR FROM OTHER
DEALINGS IN THE FONT SOFTWARE.
</pre>
<pre>
Copyright 2010,2011 Canonical Ltd.

This Font Software is licensed under the Ubuntu Font Licence, Version
1.0.  https://launchpad.net/ubuntu-font-licence
</pre>
<pre>
Copyright (C) 2014/2015  Ivan Botty

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    </pre>

  
