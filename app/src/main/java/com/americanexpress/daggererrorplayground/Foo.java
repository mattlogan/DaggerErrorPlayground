package com.americanexpress.daggererrorplayground;

import dagger.ObjectGraph;
import javax.inject.Inject;

public class Foo<T> {

    @Inject Bar<Baz> bazBar;

    public Foo() {
        ObjectGraph.create(new MainModule()).inject(this);
    }
}
