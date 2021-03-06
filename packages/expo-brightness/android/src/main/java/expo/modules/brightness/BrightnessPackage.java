package expo.modules.brightness;

import android.content.Context;

import java.util.Collections;
import java.util.List;

import expo.core.BasePackage;
import expo.core.ExportedModule;

public class BrightnessPackage extends BasePackage {
  @Override
  public List<ExportedModule> createExportedModules(Context context) {
    return Collections.singletonList((ExportedModule) new BrightnessModule(context));
  }
}
