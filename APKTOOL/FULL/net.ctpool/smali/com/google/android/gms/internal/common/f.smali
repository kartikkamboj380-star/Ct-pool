.class final Lcom/google/android/gms/internal/common/f;
.super Lcom/google/android/gms/internal/common/K;
.source "SourceFile"


# instance fields
.field private final o:Lcom/google/android/gms/internal/common/h;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/common/h;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/common/K;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/common/f;->o:Lcom/google/android/gms/internal/common/h;

    return-void
.end method


# virtual methods
.method protected final c(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/common/f;->o:Lcom/google/android/gms/internal/common/h;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
