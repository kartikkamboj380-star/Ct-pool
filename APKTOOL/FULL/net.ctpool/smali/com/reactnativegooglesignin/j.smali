.class public final synthetic Lcom/reactnativegooglesignin/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativegooglesignin/j;->m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/j;->m:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    invoke-static {v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->e(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    return-void
.end method
