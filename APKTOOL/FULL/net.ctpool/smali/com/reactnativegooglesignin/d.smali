.class public Lcom/reactnativegooglesignin/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/A0;


# direct methods
.method constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/common/SignInButton;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativegooglesignin/d;->c(Lcom/google/android/gms/common/SignInButton;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/common/SignInButton;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativegooglesignin/d;->d(Lcom/google/android/gms/common/SignInButton;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/common/SignInButton;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "receiveCommand must not be called"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lcom/google/android/gms/common/SignInButton;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "setProperty must not be called"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
