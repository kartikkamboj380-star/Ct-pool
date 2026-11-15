.class final Lcom/google/android/gms/internal/base/j;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field a:I

.field b:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/base/j;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    if-eqz p1, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/base/j;->a:I

    iput v0, p0, Lcom/google/android/gms/internal/base/j;->a:I

    iget p1, p1, Lcom/google/android/gms/internal/base/j;->b:I

    iput p1, p0, Lcom/google/android/gms/internal/base/j;->b:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/base/j;->a:I

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/base/k;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/base/k;-><init>(Lcom/google/android/gms/internal/base/j;)V

    return-object v0
.end method
