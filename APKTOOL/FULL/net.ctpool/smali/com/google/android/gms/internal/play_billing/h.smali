.class final Lcom/google/android/gms/internal/play_billing/h;
.super Lcom/google/android/gms/internal/play_billing/d;
.source "SourceFile"


# instance fields
.field private final o:Lcom/google/android/gms/internal/play_billing/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/j;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/play_billing/d;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/h;->o:Lcom/google/android/gms/internal/play_billing/j;

    return-void
.end method


# virtual methods
.method protected final c(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/h;->o:Lcom/google/android/gms/internal/play_billing/j;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
