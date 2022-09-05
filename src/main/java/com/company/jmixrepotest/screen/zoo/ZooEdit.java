package com.company.jmixrepotest.screen.zoo;

import io.jmix.ui.screen.*;
import com.company.jmixrepotest.entity.Zoo;

@UiController("jrt_Zoo.edit")
@UiDescriptor("zoo-edit.xml")
@EditedEntityContainer("zooDc")
public class ZooEdit extends StandardEditor<Zoo> {
}