.class public abstract Lcom/android/billingclient/api/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Landroid/content/Context;)Lcom/android/billingclient/api/b$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/billingclient/api/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/b$a;-><init>(Landroid/content/Context;LC0/N;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(LC0/a;LC0/b;)V
.end method

.method public abstract b(LC0/d;LC0/e;)V
.end method

.method public abstract c()V
.end method

.method public abstract d(Ljava/lang/String;)Lcom/android/billingclient/api/e;
.end method

.method public abstract e()Z
.end method

.method public abstract f(Landroid/app/Activity;Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/e;
.end method

.method public abstract h(Lcom/android/billingclient/api/h;LC0/f;)V
.end method

.method public abstract i(LC0/j;LC0/g;)V
.end method

.method public abstract j(LC0/k;LC0/h;)V
.end method

.method public abstract k(LC0/c;)V
.end method
