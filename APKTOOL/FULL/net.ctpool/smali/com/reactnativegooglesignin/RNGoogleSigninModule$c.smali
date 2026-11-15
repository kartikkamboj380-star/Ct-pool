.class Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Void;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenClearingPromiseWrapper()Lcom/reactnativegooglesignin/c;

    move-result-object v2

    :try_start_0
    invoke-static {v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->access$200(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const/4 v3, 0x0

    aget-object p1, p1, v3

    invoke-static {v0, p1}, Lh3/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {v2, p1}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    :goto_0
    return-object v1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;->a([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
