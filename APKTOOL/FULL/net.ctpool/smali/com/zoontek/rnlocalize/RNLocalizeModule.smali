.class public Lcom/zoontek/rnlocalize/RNLocalizeModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Li2/a;
    name = "RNLocalize"
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method


# virtual methods
.method public getCalendar()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-static {}, Lf5/i;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->c(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrencies()Lcom/facebook/react/bridge/WritableArray;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->e(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    return-object v0
.end method

.method public getLocales()Lcom/facebook/react/bridge/WritableArray;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->h(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNLocalize"

    return-object v0
.end method

.method public getNumberFormatSettings()Lcom/facebook/react/bridge/WritableMap;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->j(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    return-object v0
.end method

.method public getTemperatureUnit()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->n(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-static {}, Lf5/i;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uses24HourClock()Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->p(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    move-result v0

    return v0
.end method

.method public usesAutoDateAndTime()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->q(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public usesAutoTimeZone()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->r(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public usesMetricSystem()Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lf5/i;->s(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    move-result v0

    return v0
.end method
