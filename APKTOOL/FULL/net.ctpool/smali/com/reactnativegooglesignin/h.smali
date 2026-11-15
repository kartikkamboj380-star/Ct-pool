.class public final synthetic Lcom/reactnativegooglesignin/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

.field public final synthetic n:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativegooglesignin/h;->m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    iput-object p2, p0, Lcom/reactnativegooglesignin/h;->n:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/h;->m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    iget-object v1, p0, Lcom/reactnativegooglesignin/h;->n:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V

    return-void
.end method
