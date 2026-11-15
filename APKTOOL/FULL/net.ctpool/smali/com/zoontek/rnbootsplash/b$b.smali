.class Lcom/zoontek/rnbootsplash/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/SplashScreen$OnExitAnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zoontek/rnbootsplash/b;->n(Landroid/app/Activity;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/zoontek/rnbootsplash/b$b;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashScreenExit(Landroid/window/SplashScreenView;)V
    .locals 0

    invoke-static {p1}, Le5/g;->a(Landroid/window/SplashScreenView;)V

    iget-object p1, p0, Lcom/zoontek/rnbootsplash/b$b;->a:Landroid/app/Activity;

    invoke-static {p1}, Le5/e;->a(Landroid/app/Activity;)Landroid/window/SplashScreen;

    move-result-object p1

    invoke-static {p1}, Le5/h;->a(Landroid/window/SplashScreen;)V

    return-void
.end method
