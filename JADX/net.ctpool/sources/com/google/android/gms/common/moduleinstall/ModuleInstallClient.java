package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    AbstractC2272l areModulesAvailable(OptionalModuleApi... optionalModuleApiArr);

    AbstractC2272l deferredInstall(OptionalModuleApi... optionalModuleApiArr);

    AbstractC2272l getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    AbstractC2272l installModules(ModuleInstallRequest moduleInstallRequest);

    AbstractC2272l releaseModules(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    AbstractC2272l unregisterListener(InstallStatusListener installStatusListener);
}
