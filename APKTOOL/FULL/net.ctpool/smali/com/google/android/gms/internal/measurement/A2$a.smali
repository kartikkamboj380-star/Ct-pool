.class public final Lcom/google/android/gms/internal/measurement/A2$a;
.super Lcom/google/android/gms/internal/measurement/z4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/i5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/A2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A2;->J()Lcom/google/android/gms/internal/measurement/A2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/z4$b;-><init>(Lcom/google/android/gms/internal/measurement/z4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/L2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/A2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(I)Lcom/google/android/gms/internal/measurement/A2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/A2;->F(Lcom/google/android/gms/internal/measurement/A2;I)V

    return-object p0
.end method

.method public final u(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/A2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/A2;->G(Lcom/google/android/gms/internal/measurement/A2;Ljava/lang/Iterable;)V

    return-object p0
.end method
