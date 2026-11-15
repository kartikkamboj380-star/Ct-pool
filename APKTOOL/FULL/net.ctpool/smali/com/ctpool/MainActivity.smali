.class public final Lcom/ctpool/MainActivity;
.super Lcom/facebook/react/ReactActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/ReactActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected m0()Lcom/facebook/react/u;
    .locals 3

    .line 1
    new-instance v0, LW1/a;

    invoke-virtual {p0}, Lcom/ctpool/MainActivity;->n0()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/facebook/react/defaults/a;->a()Z

    move-result v2

    invoke-direct {v0, p0, v1, v2}, LW1/a;-><init>(Lcom/facebook/react/ReactActivity;Ljava/lang/String;Z)V

    return-object v0
.end method

.method protected n0()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ctpool"

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    sget p1, LF0/b;->a:I

    invoke-static {p0, p1}, Lcom/zoontek/rnbootsplash/a;->a(Landroid/app/Activity;I)V

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lcom/facebook/react/ReactActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method
