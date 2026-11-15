.class public final Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;
.super Lcom/facebook/fbreact/specs/NativeDevToolsSettingsManagerSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "DevToolsSettingsManager"
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule$a;

.field private static final KEY_CONSOLE_PATCH_SETTINGS:Ljava/lang/String; = "ConsolePatchSettings"

.field private static final KEY_PROFILING_SETTINGS:Ljava/lang/String; = "ProfilingSettings"

.field private static final SHARED_PREFERENCES_PREFIX:Ljava/lang/String; = "ReactNative__DevToolsSettings"


# instance fields
.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->Companion:Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevToolsSettingsManagerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    const-string v0, "ReactNative__DevToolsSettings"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getSharedPreferences(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public getConsolePatchSettings()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "ConsolePatchSettings"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProfilingSettings()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "ProfilingSettings"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setConsolePatchSettings(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ConsolePatchSettings"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setProfilingSettings(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ProfilingSettings"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
