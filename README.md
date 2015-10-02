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
    compile 'com.botty.ubuntufont:ubuntufont:0.0.3'
}
</pre>
<p>2. Add to your layout</p>

```xml
<com.botty.ubuntufont.Regular
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:text="Your text !"/>
```    
#All fonts 

```xml
<com.botty.ubuntufont.Regular
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Regular"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.RegularItalic
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Regular Italic"
            android:textSize="20sp"
            android:paddingBottom="10dp"
            android:paddingTop="10dp" />

<com.botty.ubuntufont.Bold
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Bold"
            android:textSize="20sp"
            android:paddingBottom="10dp"
            android:paddingTop="10dp" />

<com.botty.ubuntufont.BoldItalic
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Bold Italic"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.Light
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Light"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.Medium
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Medium"
            android:textSize="20sp"
            android:paddingBottom="10dp"
            android:paddingTop="10dp" />

<com.botty.ubuntufont.Condensed
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="Ubuntu Condesed"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.MonoRegular
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="UbuntuMono Regular"
            android:textSize="20sp"
            android:paddingBottom="10dp"
            android:paddingTop="10dp" />

<com.botty.ubuntufont.MonoRegularItalic
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="UbuntuMono Regular Italic"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.MonoBold
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="UbuntuMono Bold"
            android:textSize="20sp"
            android:paddingTop="10dp"
            android:paddingBottom="10dp" />

<com.botty.ubuntufont.MonoBoldItalic
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="UbuntuMono Bold Regular"
            android:textSize="20sp"
            android:paddingBottom="10dp"
            android:paddingTop="10dp" />
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

  
