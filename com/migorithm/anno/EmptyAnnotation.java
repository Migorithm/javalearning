package com.migorithm.anno;

public @interface EmptyAnnotation { }
//pretty much the same as the way you create interface except for @ mark before inferface.
//you cannot extend anything. HOWEVER, behind the scene this EmptyAnnotation extends Annotation interface.
//It's the same as java class extends Object class implicitly.

