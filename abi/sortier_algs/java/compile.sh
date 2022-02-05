javac -Xlint:all $(find src | rg -e "\.java$") \
-d build \
#&&
#cd build && jar -cvfm ../App.jar ../Manifest.txt ../res $(find | rg -e "\.class$") \
#&& rm-fr build/*
