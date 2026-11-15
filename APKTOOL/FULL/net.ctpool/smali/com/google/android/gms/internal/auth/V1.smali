.class public final synthetic Lcom/google/android/gms/internal/auth/V1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/auth/b;

.field public final synthetic b:Lcom/google/android/gms/internal/auth/g;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/b;Lcom/google/android/gms/internal/auth/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/V1;->a:Lcom/google/android/gms/internal/auth/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/V1;->b:Lcom/google/android/gms/internal/auth/g;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/V1;->a:Lcom/google/android/gms/internal/auth/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/V1;->b:Lcom/google/android/gms/internal/auth/g;

    check-cast p1, Lcom/google/android/gms/internal/auth/Q1;

    check-cast p2, Lz3/m;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth/T1;

    new-instance v2, Lcom/google/android/gms/internal/auth/Y1;

    invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/auth/Y1;-><init>(Lcom/google/android/gms/internal/auth/b;Lz3/m;)V

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/auth/T1;->l0(Lcom/google/android/gms/common/api/internal/IStatusCallback;Lcom/google/android/gms/internal/auth/g;)V

    return-void
.end method
