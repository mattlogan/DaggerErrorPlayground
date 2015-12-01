package com.americanexpress.daggererrorplayground;

import dagger.Module;
import dagger.Provides;

@Module(
           injects = Foo.class
)
public class MainModule {

    @Provides Bar<Baz> provideBazBar() {
        return new Bar<>();
    }
}
