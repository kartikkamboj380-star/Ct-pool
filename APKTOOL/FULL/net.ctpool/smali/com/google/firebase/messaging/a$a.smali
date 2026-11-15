.class final Lcom/google/firebase/messaging/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final a:Lcom/google/firebase/messaging/a$a;

.field private static final b:Lw4/c;

.field private static final c:Lw4/c;

.field private static final d:Lw4/c;

.field private static final e:Lw4/c;

.field private static final f:Lw4/c;

.field private static final g:Lw4/c;

.field private static final h:Lw4/c;

.field private static final i:Lw4/c;

.field private static final j:Lw4/c;

.field private static final k:Lw4/c;

.field private static final l:Lw4/c;

.field private static final m:Lw4/c;

.field private static final n:Lw4/c;

.field private static final o:Lw4/c;

.field private static final p:Lw4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$a;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$a;->a:Lcom/google/firebase/messaging/a$a;

    const-string v0, "projectNumber"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->b:Lw4/c;

    const-string v0, "messageId"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->c:Lw4/c;

    const-string v0, "instanceId"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->d:Lw4/c;

    const-string v0, "messageType"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->e:Lw4/c;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->f:Lw4/c;

    const-string v0, "packageName"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->g:Lw4/c;

    const-string v0, "collapseKey"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->h:Lw4/c;

    const-string v0, "priority"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->i:Lw4/c;

    const-string v0, "ttl"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->j:Lw4/c;

    const-string v0, "topic"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->k:Lw4/c;

    const-string v0, "bulkId"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->l:Lw4/c;

    const-string v0, "event"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->m:Lw4/c;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->n:Lw4/c;

    const-string v0, "campaignId"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->o:Lw4/c;

    const-string v0, "composerLabel"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->p:Lw4/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LJ4/a;

    check-cast p2, Lw4/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$a;->b(LJ4/a;Lw4/e;)V

    return-void
.end method

.method public b(LJ4/a;Lw4/e;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/a$a;->b:Lw4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LJ4/a;->l()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface {p2, v0, v1, v2}, Lw4/e;->d(Lw4/c;J)Lw4/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/google/firebase/messaging/a$a;->c:Lw4/c;

    .line 11
    .line 12
    invoke-virtual {p1}, LJ4/a;->h()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/google/firebase/messaging/a$a;->d:Lw4/c;

    .line 20
    .line 21
    invoke-virtual {p1}, LJ4/a;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/google/firebase/messaging/a$a;->e:Lw4/c;

    .line 29
    .line 30
    invoke-virtual {p1}, LJ4/a;->i()LJ4/a$c;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lcom/google/firebase/messaging/a$a;->f:Lw4/c;

    .line 38
    .line 39
    invoke-virtual {p1}, LJ4/a;->m()LJ4/a$d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lcom/google/firebase/messaging/a$a;->g:Lw4/c;

    .line 47
    .line 48
    invoke-virtual {p1}, LJ4/a;->j()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lcom/google/firebase/messaging/a$a;->h:Lw4/c;

    .line 56
    .line 57
    invoke-virtual {p1}, LJ4/a;->d()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lcom/google/firebase/messaging/a$a;->i:Lw4/c;

    .line 65
    .line 66
    invoke-virtual {p1}, LJ4/a;->k()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-interface {p2, v0, v1}, Lw4/e;->b(Lw4/c;I)Lw4/e;

    .line 71
    .line 72
    .line 73
    sget-object v0, Lcom/google/firebase/messaging/a$a;->j:Lw4/c;

    .line 74
    .line 75
    invoke-virtual {p1}, LJ4/a;->o()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-interface {p2, v0, v1}, Lw4/e;->b(Lw4/c;I)Lw4/e;

    .line 80
    .line 81
    .line 82
    sget-object v0, Lcom/google/firebase/messaging/a$a;->k:Lw4/c;

    .line 83
    .line 84
    invoke-virtual {p1}, LJ4/a;->n()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 89
    .line 90
    .line 91
    sget-object v0, Lcom/google/firebase/messaging/a$a;->l:Lw4/c;

    .line 92
    .line 93
    invoke-virtual {p1}, LJ4/a;->b()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    invoke-interface {p2, v0, v1, v2}, Lw4/e;->d(Lw4/c;J)Lw4/e;

    .line 98
    .line 99
    .line 100
    sget-object v0, Lcom/google/firebase/messaging/a$a;->m:Lw4/c;

    .line 101
    .line 102
    invoke-virtual {p1}, LJ4/a;->f()LJ4/a$b;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 107
    .line 108
    .line 109
    sget-object v0, Lcom/google/firebase/messaging/a$a;->n:Lw4/c;

    .line 110
    .line 111
    invoke-virtual {p1}, LJ4/a;->a()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p2, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 116
    .line 117
    .line 118
    sget-object v0, Lcom/google/firebase/messaging/a$a;->o:Lw4/c;

    .line 119
    .line 120
    invoke-virtual {p1}, LJ4/a;->c()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    invoke-interface {p2, v0, v1, v2}, Lw4/e;->d(Lw4/c;J)Lw4/e;

    .line 125
    .line 126
    .line 127
    sget-object v0, Lcom/google/firebase/messaging/a$a;->p:Lw4/c;

    .line 128
    .line 129
    invoke-virtual {p1}, LJ4/a;->e()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {p2, v0, p1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 134
    .line 135
    .line 136
    return-void
.end method
