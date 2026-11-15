.class public final Lcom/ctpool/MainApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/w;


# instance fields
.field private final m:Lcom/facebook/react/L;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    new-instance v0, Lcom/ctpool/MainApplication$a;

    invoke-direct {v0, p0}, Lcom/ctpool/MainApplication$a;-><init>(Lcom/ctpool/MainApplication;)V

    iput-object v0, p0, Lcom/ctpool/MainApplication;->m:Lcom/facebook/react/L;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ctpool/MainApplication;->m:Lcom/facebook/react/L;

    return-object v0
.end method

.method public b()Lcom/facebook/react/y;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ctpool/MainApplication;->a()Lcom/facebook/react/L;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/defaults/b;->a(Landroid/content/Context;Lcom/facebook/react/L;)Lcom/facebook/react/y;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/soloader/SoLoader;->m(Landroid/content/Context;Z)V

    return-void
.end method
