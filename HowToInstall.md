**Since release 0.3.0, A4E is available on [Eclipse Marketplace](http://code.google.com/p/alloy4eclipse/wiki/Tutorial). While the options below are still possible, we highly recommend A4E users to install A4E from the marketplace.**

# Install and update using Eclipse Update Manager (preferred option) #
  1. **uninstall first former hand-installed version of the plugin**
  1. within Eclipse, go to Help/Software Update/Find and install ...
  1. select "Search for new features to install".
  1. push the "new remote site" button.
  1. enter any name, "Alloy 4 Eclipse update site" might be a good choice
  1. enter the URL http://alloy4eclipse.googlecode.com/svn/trunk/updatesite/
  1. follows Eclipse directions

New versions will be automatically managed by Eclipse Update Manager.

# How to install the plugin by hand #

First of all, [download](http://code.google.com/p/alloy4eclipse/downloads/list) the latest zip file

## First time ##
  1. go to eclipse home directory
  1. unzip the content of the alloy4eclipsexxxx.zip file
  1. **launch eclipse using the -clean parameter**: `eclipse -clean`

## How to update the plugin ##

  1. go to eclipse home directory
  1. remove the jar files starting with fr.univartois.cril in the features and plugins directory
  1. unzip the content of the alloy4eclipsexxxx.zip file
  1. **launch eclipse using the -clean parameter**: `eclipse -clean`

# How to install platform specific binairies #

By default, Alloy4Eclipse uses the Java SAT solver [SAT4J](http://www.sat4j.org).
While SAT4J has the advantage of being platform independent, it is generally slower
than platform specific solvers such as [award winning minisat](http://www.minisat.se).

Alloy 4 ships with one SAT solver to be called as an external program: Berkmin.
It also ships with two solvers to be used through JNI: minisat and zChaff.

Using those platform specific binaries require some actions from the user.

The Alloy Team makes Alloy available as a platform independent jar file (the one we ship in A4E) plus [additional platform dependent jar files](http://alloy.mit.edu/alloy4/sep/). Just download the jar file corresponding to your architecture and follow the system dependent instructions given below:

## Under Linux ##

### Berkmin ###
Just create a directory in which you will put the executable, and set that path in A4E preferences.

### Minisat and Zchaff ###
  * Create a directory for the platform libraries
  * put there the .so files (libminisat.so, libminisatprover.so and libzchaff.so)
  * add that path to your LD\_LIBRARY\_PATH environment variable. if you are using bash, add the following lines in your .bashrc
```
LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/path/to/the/lib/files
export LD_LIBRARY_PATH
```
> if you are using tcsh, add the following lines in your .tcshrc
```
setenv LD_LIBRARY_PATH ${LD_LIBRARY_PATH}:/path/to/the/lib/files
```

## Under Macos ##

If you can use a console under Mac Os X, then just proceed as under Linux (by default, the shell is bash).

## Under Windows ##

To be completed.