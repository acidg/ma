#!/bin/sh

for file in $(ls *.svg)
do
    inkscape --file=$file --export-area-drawing --without-gui --export-pdf=${file%%.*}.pdf
done

