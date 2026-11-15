.class public final Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;
.super Lcom/facebook/fbreact/specs/NativeI18nManagerSpec;
.source "SourceFile"


# annotations
.annotation runtime Li2/a;
    name = "I18nManager"
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeI18nManagerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method


# virtual methods
.method public allowRTL(Z)V
    .locals 3

    sget-object v0, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    invoke-virtual {v0}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/i18nmanager/a;->b(Landroid/content/Context;Z)V

    return-void
.end method

.method public forceRTL(Z)V
    .locals 3

    sget-object v0, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    invoke-virtual {v0}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/i18nmanager/a;->e(Landroid/content/Context;Z)V

    return-void
.end method

.method public getTypedExportedConstants()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    invoke-virtual {v2}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v3

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "isRTL"

    invoke-static {v4, v3}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v3

    invoke-virtual {v2}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v2, "doLeftAndRightSwapInRTL"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    const-string v2, "localeIdentifier"

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v1

    filled-new-array {v3, v0, v1}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public swapLeftAndRightInRTL(Z)V
    .locals 3

    sget-object v0, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    invoke-virtual {v0}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/i18nmanager/a;->m(Landroid/content/Context;Z)V

    return-void
.end method
