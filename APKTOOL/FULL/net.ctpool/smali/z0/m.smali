.class public Lz0/m;
.super Lz0/o;
.source "SourceFile"


# instance fields
.field private h:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz0/o;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/m;->h:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/m;->h:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/provider/Telephony$Sms;->getDefaultSmsPackage(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "market://details?id=com.android.mms"

    .line 2
    .line 3
    return-object v0
.end method

.method public l(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lz0/o;->l(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lz0/o;->m()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
