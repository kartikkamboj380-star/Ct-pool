.class public final LS5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS5/p;


# instance fields
.field public final a:Landroidx/room/u;

.field public final b:Landroidx/room/i;

.field public final c:Landroidx/room/h;

.field public final d:Landroidx/room/A;

.field public final e:Landroidx/room/A;


# direct methods
.method public constructor <init>(Landroidx/room/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 5
    .line 6
    new-instance v0, LS5/q$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, LS5/q$a;-><init>(LS5/q;Landroidx/room/u;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LS5/q;->b:Landroidx/room/i;

    .line 12
    .line 13
    new-instance v0, LS5/q$b;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, LS5/q$b;-><init>(LS5/q;Landroidx/room/u;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LS5/q;->c:Landroidx/room/h;

    .line 19
    .line 20
    new-instance v0, LS5/q$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LS5/q$c;-><init>(LS5/q;Landroidx/room/u;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LS5/q;->d:Landroidx/room/A;

    .line 26
    .line 27
    new-instance v0, LS5/q$d;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, LS5/q$d;-><init>(LS5/q;Landroidx/room/u;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LS5/q;->e:Landroidx/room/A;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 14

    .line 1
    const-string v0, "SELECT * FROM work_data"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/room/x;->d(Ljava/lang/String;I)Landroidx/room/x;

    move-result-object v0

    iget-object v2, p0, LS5/q;->a:Landroidx/room/u;

    invoke-virtual {v2}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object v2, p0, LS5/q;->a:Landroidx/room/u;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, LX/b;->b(Landroidx/room/u;LZ/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v4, "id"

    invoke-static {v2, v4}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "notification"

    invoke-static {v2, v5}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "trigger"

    invoke-static {v2, v6}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "with_alarm_manager"

    invoke-static {v2, v7}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v9, v3

    goto :goto_1

    :cond_0
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    :goto_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v10, v3

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v10

    :goto_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_2

    move-object v11, v3

    goto :goto_3

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v11

    :goto_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    move-object v12, v3

    goto :goto_4

    :cond_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    :goto_4
    if-nez v12, :cond_4

    move-object v12, v3

    goto :goto_6

    :cond_4
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eqz v12, :cond_5

    const/4 v12, 0x1

    goto :goto_5

    :cond_5
    move v12, v1

    :goto_5
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    :goto_6
    new-instance v13, LS5/r;

    invoke-direct {v13, v9, v10, v11, v12}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_7

    :cond_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    return-object v8

    :goto_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    throw v1
.end method

.method public b(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LX/d;->b()Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "DELETE FROM work_data WHERE id in ("

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v0, v1}, LX/d;->a(Ljava/lang/StringBuilder;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, ")"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, LS5/q;->a:Landroidx/room/u;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroidx/room/u;->compileStatement(Ljava/lang/String;)LZ/k;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v1, 0x1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    invoke-interface {v0, v1}, LZ/i;->A0(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-interface {v0, v1, v2}, LZ/i;->v(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/room/u;->beginTransaction()V

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-interface {v0}, LZ/k;->D()I

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public c(LS5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/u;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, LS5/q;->c:Landroidx/room/h;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/room/h;->handle(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS5/q;->d:Landroidx/room/A;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/A;->acquire()LZ/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LS5/q;->a:Landroidx/room/u;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/room/u;->beginTransaction()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0}, LZ/k;->D()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LS5/q;->a:Landroidx/room/u;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LS5/q;->a:Landroidx/room/u;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/room/u;->endTransaction()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LS5/q;->d:Landroidx/room/A;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroidx/room/A;->release(LZ/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    iget-object v2, p0, LS5/q;->a:Landroidx/room/u;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/room/u;->endTransaction()V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, LS5/q;->d:Landroidx/room/A;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Landroidx/room/A;->release(LZ/k;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public e(LS5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/u;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, LS5/q;->b:Landroidx/room/i;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/room/i;->insert(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public f(Ljava/lang/String;)LS5/r;
    .locals 9

    .line 1
    const-string v0, "SELECT * from work_data WHERE id = ?"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Landroidx/room/x;->d(Ljava/lang/String;I)Landroidx/room/x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/room/x;->A0(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, v1, p1}, Landroidx/room/x;->v(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {p1, v0, v2, v3}, LX/b;->b(Landroidx/room/u;LZ/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :try_start_0
    const-string v4, "id"

    .line 31
    .line 32
    invoke-static {p1, v4}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const-string v5, "notification"

    .line 37
    .line 38
    invoke-static {p1, v5}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const-string v6, "trigger"

    .line 43
    .line 44
    invoke-static {p1, v6}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-string v7, "with_alarm_manager"

    .line 49
    .line 50
    invoke-static {p1, v7}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_7

    .line 59
    .line 60
    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    move-object v4, v3

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :goto_1
    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_2

    .line 77
    .line 78
    move-object v5, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_2
    invoke-interface {p1, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_3

    .line 89
    .line 90
    move-object v6, v3

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    :goto_3
    invoke-interface {p1, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    move-object v7, v3

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    :goto_4
    if-nez v7, :cond_5

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    move v1, v2

    .line 123
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :goto_6
    new-instance v1, LS5/r;

    .line 128
    .line 129
    invoke-direct {v1, v4, v5, v6, v3}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    move-object v3, v1

    .line 133
    goto :goto_7

    .line 134
    :catchall_0
    move-exception v1

    .line 135
    goto :goto_8

    .line 136
    :cond_7
    :goto_7
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/room/x;->release()V

    .line 140
    .line 141
    .line 142
    return-object v3

    .line 143
    :goto_8
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Landroidx/room/x;->release()V

    .line 147
    .line 148
    .line 149
    throw v1
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS5/q;->a:Landroidx/room/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS5/q;->e:Landroidx/room/A;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/A;->acquire()LZ/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, LZ/i;->A0(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1, p1}, LZ/i;->v(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/room/u;->beginTransaction()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-interface {v0}, LZ/k;->D()I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/room/u;->endTransaction()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LS5/q;->e:Landroidx/room/A;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroidx/room/A;->release(LZ/k;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    iget-object v1, p0, LS5/q;->a:Landroidx/room/u;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/room/u;->endTransaction()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, LS5/q;->e:Landroidx/room/A;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroidx/room/A;->release(LZ/k;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public h(Ljava/lang/Boolean;)Ljava/util/List;
    .locals 14

    .line 1
    const-string v0, "SELECT * FROM work_data WHERE with_alarm_manager = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/room/x;->d(Ljava/lang/String;I)Landroidx/room/x;

    move-result-object v0

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object p1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Landroidx/room/x;->A0(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v3, p1

    invoke-virtual {v0, v1, v3, v4}, Landroidx/room/x;->b0(IJ)V

    :goto_1
    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    invoke-virtual {p1}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    iget-object p1, p0, LS5/q;->a:Landroidx/room/u;

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v2}, LX/b;->b(Landroidx/room/u;LZ/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v4, "id"

    invoke-static {p1, v4}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "notification"

    invoke-static {p1, v5}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "trigger"

    invoke-static {p1, v6}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "with_alarm_manager"

    invoke-static {p1, v7}, LX/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v9, v2

    goto :goto_3

    :cond_2
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    :goto_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_3

    move-object v10, v2

    goto :goto_4

    :cond_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v10

    :goto_4
    invoke-interface {p1, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object v11, v2

    goto :goto_5

    :cond_4
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v11

    :goto_5
    invoke-interface {p1, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_5

    move-object v12, v2

    goto :goto_6

    :cond_5
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    :goto_6
    if-nez v12, :cond_6

    move-object v12, v2

    goto :goto_8

    :cond_6
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eqz v12, :cond_7

    move v12, v1

    goto :goto_7

    :cond_7
    move v12, v3

    :goto_7
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    :goto_8
    new-instance v13, LS5/r;

    invoke-direct {v13, v9, v10, v11, v12}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_9

    :cond_8
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    return-object v8

    :goto_9
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Landroidx/room/x;->release()V

    throw v1
.end method
