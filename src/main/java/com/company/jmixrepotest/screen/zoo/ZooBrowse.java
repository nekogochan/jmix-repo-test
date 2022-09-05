package com.company.jmixrepotest.screen.zoo;

import io.jmix.ui.screen.*;
import com.company.jmixrepotest.entity.Zoo;

@UiController("jrt_Zoo.browse")
@UiDescriptor("zoo-browse.xml")
@LookupComponent("zoosTable")
public class ZooBrowse extends StandardLookup<Zoo> {
}